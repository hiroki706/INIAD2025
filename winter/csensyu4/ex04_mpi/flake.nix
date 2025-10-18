# nix develop
{
    description = "MPI";

    inputs.nixpkgs.url = "github:NixOS/nigpkgs/nixos-unstable";

    outputs = { self, nixpkgs }: {
        devShells.x86_64-linux.default = let
            pkgs = nixpkgs.legacyPackages.x86_64-linux;
        in pkgs.mkShell {
            buldInputs = with pkgs; [
                openmpi
                stdenv.cc
            ];
        };
    };
}
