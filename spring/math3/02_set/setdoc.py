def len():
    """
    集合に属する要素数を得る。
    >>> set = {"math", "data science", "python"}
    >>> len(set)
    3
   """
def is_in(s, x):
    """
    x in s
    集合に要素が含まれているかを調べる。
    >>> set = {"math", "data science", "python"}
    >>> "math" in set
    True
    """
def is_not_in(s, x):
    """
    x not in s
    集合に要素が含まれているかを調べる。
    >>> set = {"math", "data science", "python"}
    >>> "math" in set
    False
    """
def isdisjoint(other):
    """
    # 2つの集合が交わっていないかを調べる。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++"}
    >>> set1.isdisjoint(set2)
    True
"""
def issuperset(other):
    """
    # issubset(other)
    # set >= other
    # setがotherの部分集合であるかを調べる。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"math", "data science", "python", "java"}
    >>> set1.issubset(set2)
    True

    # set > other
    # setがotherの真部分集合であるかを調べる。
    >>> set1 > set2
    True

    # Union(other)
    # set | other |...
    # setとotherの和集合を得る。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++"}
    >>> set1.union(set2)
    {"math", "data science", "python", "java", "c++"}

    # intersection(other)
    # set & other & ...
    # setとotherの積集合を得る。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++"}
    >>> set1.intersection(set2)
    set()

    # difference(other)
    # set - other - ...
    # setとotherの差集合を得る。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"math", "c++"}
    >>> set1.difference(set2)
    {"data science", "python"}

    # symmetric_difference(other)
    # set ^ other
    # setとotherの対称差集合を得る。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++", "math"}
    >>> set1.symmetric_difference(set2)
    {"data science", "python", "java", "c++"}

    # update(other)
    # set |= other | ...
    # setにotherの要素を追加する。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++"}
    >>> set1.update(set2)
    >>> set1
    {"math", "data science", "python", "java", "c++"}

    # intersection_update(other)
    # set &= other & ...
    # setとotherの積集合をsetに代入する。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++"}
    >>> set1.intersection_update(set2)
    >>> set1
    set()

    # difference_update(other)
    # set -= other | ...
    # setからotherの要素を削除する。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"math", "c++"}
    >>> set1.difference_update(set2)
    >>> set1
    {"data science", "python"}

    # symmetric_difference_update(other)
    # set ^= other
    # setとotherの対称差集合をsetに代入する。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = {"java", "c++", "math"}
    >>> set1.symmetric_difference_update(set2)
    >>> set1
    {"data science", "python", "java", "c++"}

    # add(x)
    # 要素xをsetに追加する。
    >>> set1 = {"math", "data science", "python"}
    >>> set1.add("java")
    >>> set1
    {"math", "data science", "python", "java"}

    # remove(x)
    # 要素xをsetから削除する。
    >>> set1 = {"math", "data science", "python"}
    >>> set1.remove("math")
    >>> set1
    {"data science", "python"}
    # discard(x)
    # 要素xがあればsetから削除する。
    >>> set1 = {"math", "data science", "python"}
    >>> set1.discard("math")
    >>> set1
    {"data science", "python"}
    # pop()
    # 要素をsetから削除する。
    >>> set1 = {"math", "data science", "python"}
    >>> set1.pop()
    "math"
    >>> set1
    {"data science", "python"}
    # clear()
    # setを空にする。
    >>> set1 = {"math", "data science", "python"}
    >>> set1.clear()
    >>> set1
    set()

    # copy()
    # setのコピーを得る。
    >>> set1 = {"math", "data science", "python"}
    >>> set2 = set1.copy()
    >>> set2
    {"math", "data science", "python"}
    """
    return None

if __name__ == "__main__":
    import doctest
    doctest.testmod()
