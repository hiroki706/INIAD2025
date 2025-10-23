{
  description = "A flake for building and running mtkernel_3";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };

  outputs = { self, nixpkgs }:
    let
      system = "x86_64-linux";
      pkgs = import nixpkgs { inherit system; };
    in
    {
      packages.${system}.default = pkgs.stdenv.mkDerivation {
        name = "mtkernel_3";
        src = ./.;
        buildInputs = [ pkgs.gcc-arm-embedded pkgs.make ];
        buildPhase = ''
          make -C build_make/
        '';
        installPhase = ''
          mkdir -p $out/bin
          cp build_make/mtkernel_3.elf $out/bin/
        '';
      };

      apps.${system}.default = {
        type = "app";
        program = ''
          #!${pkgs.bash}/bin/bash
          echo "Watching for changes in usermain.c..."
          while true; do
            find . -name usermain.c | ${pkgs.entr}/bin/entr -d -p sh -c 'make -C build_make/ clean && make -C build_make/ && ${pkgs.qemu}/bin/qemu-system-arm -M lm3s6965evb -nographic -kernel build_make/mtkernel_3.elf'
            sleep 1
          done
        '';
      };

      devShells.${system}.default = pkgs.mkShell {
        buildInputs = [
          pkgs.gcc-arm-embedded
          pkgs.qemu
          pkgs.gnumake
          pkgs.entr
        ];
      };
    };
}
