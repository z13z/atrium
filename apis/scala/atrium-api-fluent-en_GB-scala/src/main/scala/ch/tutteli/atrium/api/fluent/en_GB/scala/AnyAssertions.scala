package ch.tutteli.atrium.api.fluent.en_GB.scala

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl

class AnyAssertions[T](expect: Expect[T]) {
    def toBe(expected: T): Expect[T] = expect.addAssertion(ExpectImpl.INSTANCE.getAny().toBe(expect, expected))
}
