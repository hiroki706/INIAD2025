def convert(base10num: str, base: int) -> str:
    """正数の10進数をb進数(1 < b < 10)に変換するPythonプログラムを書け。
    あなたのプログラムは、整数と浮動小数点数の両方を変換できる必要があります。プログラムには、bin()、 oct()、hex()などの数体系の変換に関連する組み込み関数は使用できません（いずれにしてもこれらの関数は浮動小数点数を処理出来ない）。
    Example:
    >>> convert("10", 2)
    '1010'
    >>> convert("109.78125", 2)
    '1101101.11001'
    >>> convert("12.25", 8)
    '14.2'
    >>> convert("3.14579", 2)
    '11.001001010101'
    """
    if not 1 < base < 10:
        raise ValueError("Base must be between 2 and 9.")
    intbuf = []
    x = int(base10num.split(".")[0])
    while x > 0:
        intbuf.append(str(x % base))
        x //= base
    f_part = base10num.split(".", 1)
    intans = "".join(reversed(intbuf))
    fbuf = []
    if len(f_part) == 2:
        f_part = f_part[1]
        f = int(f_part)
        k = 10 ** len(f_part)
        for _ in range(12):
            f *= base
            if f >= k:
                fbuf.append(f"{f // k}")
                f -= (f // k) * k
            else:
                fbuf.append("0")
            if f == 0:
                break
    fans = "".join(fbuf)
    return f"{intans}.{fans}" if fans else intans


if __name__ == "__main__":
    import doctest

    doctest.testmod()

base10 = input("Enter a decimal number you want to convert: ")
conv_base = int(input("Enter the base you want to convert to (b): "))

print(f"The base-8 equivalent of {base10} is {convert(base10, conv_base)}")
