package ch.tutteli.atrium.api.fluent.en_GB

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.core.CoreFactory

package object scala {
    implicit def expectToAnyAssertions[T](expect: Expect[T]): AnyAssertions[T] = new AnyAssertions[T](expect)
}
