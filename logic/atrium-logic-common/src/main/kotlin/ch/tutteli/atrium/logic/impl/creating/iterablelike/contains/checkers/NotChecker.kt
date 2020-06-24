package ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.checkers

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.domain.creating.iterable.contains.IterableContains
import ch.tutteli.atrium.translations.DescriptionBasic

/**
 * Represents a check that an expected entry is not contained in the [Iterable].
 */
class NotChecker : IterableContains.Checker {

    override fun createAssertion(foundNumberOfTimes: Int): Assertion =
        ExpectImpl.builder.createDescriptive(DescriptionBasic.IS, 0) { foundNumberOfTimes == 0 }
}
