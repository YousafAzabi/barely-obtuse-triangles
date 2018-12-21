[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FYousafAzabi%2Fbarely-obtuse-triangles.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2FYousafAzabi%2Fbarely-obtuse-triangles?ref=badge_shield)

# Barely Obtuse Triangles
A class to finds the number (`N`) of barely obtuse triangles, those satisfy:
```
(a^2) + (b^2) = (c^2) - 1
```

```
a + b + c = N
```
where `a`, `b` and `c` are the triangle sides, `N` is an integer and `a <= b <= c`.

## Classes

There are two similar Java files in this project:
* BarelyObtuseTriangles.java which contains 3 integrated for loops to solve for solution. The complexity of the solution is `O(n3)`.
* BarelyObtuseTriangles_reducedComplexityO2.java has a reduced complexity of `O(n2)` with only two loops by solving equations above.

## Examples

When `N = 7` then there is one triangle where `(a, b, c)` are `(2, 2, 3)`.
When `N = 21` then there is two triangle where `(a, b, c)` are `(4, 8, 9)`.
