// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")
package ch.tutteli.atrium.api.cc.infix.en_GB

import ch.tutteli.atrium.api.cc.infix.en_GB.keywords.only
import ch.tutteli.atrium.api.cc.infix.en_GB.keywords.order
import ch.tutteli.atrium.api.infix.en_GB.*
import ch.tutteli.atrium.creating.Assert
import ch.tutteli.atrium.domain.builders.migration.asAssert
import ch.tutteli.atrium.domain.builders.migration.asExpect
import ch.tutteli.atrium.domain.builders.migration.asSubExpect
import ch.tutteli.atrium.verbs.internal.AssertionVerbFactory

//TODO remove with 1.0.0, no need to migrate to Spek 2
class IterableContainsInAnyOrderOnlyEntriesAssertionsSpec : ch.tutteli.atrium.spec.integration.IterableContainsInAnyOrderOnlyEntriesAssertionsSpec(
    AssertionVerbFactory,
    getContainsPair(),
    getContainsNullablePair(),
    "◆ ", "✔ ", "✘ ", "❗❗ ", "⚬ ", "» "
) {
    companion object : IterableContainsSpecBase() {
        fun getContainsPair()
            = "$toContain $inAnyOrder $butOnly $inAnyOrderOnlyEntries" to Companion::containsInAnyOrderOnlyEntries

        private fun containsInAnyOrderOnlyEntries(plant: Assert<Iterable<Double>>, a: Assert<Double>.() -> Unit, aX: Array<out Assert<Double>.() -> Unit>): Assert<Iterable<Double>> {
            return if (aX.isEmpty()) {
                ((plant.asExpect().contains(o) inAny ch.tutteli.atrium.api.infix.en_GB.order).but(ch.tutteli.atrium.api.infix.en_GB.only)).entry(asSubExpect(a)).asAssert()
            } else {
                ((plant.asExpect().contains(o) inAny ch.tutteli.atrium.api.infix.en_GB.order).but(ch.tutteli.atrium.api.infix.en_GB.only)).the(Entries(a, *aX).mapArguments.to { asSubExpect(it) }
                    .let { (first, rest) -> entries(first, *rest) }).asAssert()
            }
        }

        fun getContainsNullablePair()
            = "$toContain $inAnyOrder $butOnly $inAnyOrderOnlyEntries" to Companion::containsInAnyOrderOnlyNullableEntries

        private fun containsInAnyOrderOnlyNullableEntries(plant: Assert<Iterable<Double?>>, a: (Assert<Double>.() -> Unit)?, aX: Array<out (Assert<Double>.() -> Unit)?>): Assert<Iterable<Double?>> {
            return if (aX.isEmpty()) {
                ((plant.asExpect().contains(o) inAny ch.tutteli.atrium.api.infix.en_GB.order).but(ch.tutteli.atrium.api.infix.en_GB.only)).entry(asSubExpect(a)).asAssert()
            } else {
                ((plant.asExpect().contains(o) inAny ch.tutteli.atrium.api.infix.en_GB.order).but(ch.tutteli.atrium.api.infix.en_GB.only)).the(Entries(a, *aX).mapArguments.to { asSubExpect(it) }
                    .let { (first, rest) -> entries(first, *rest) }).asAssert()
            }
        }
    }
}
