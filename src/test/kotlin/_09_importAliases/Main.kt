package _09_importAliases

import _09_importAliases.bar.Foo as BarFoo
import _09_importAliases.foo.Foo as FooFoo

fun main() {
    BarFoo()
    FooFoo()
}