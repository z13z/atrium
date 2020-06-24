package ch.tutteli.atrium.logic.creating.iterablelike.contains

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.assertions.AssertionGroup
import ch.tutteli.atrium.logic.creating.basic.contains.Contains
import ch.tutteli.atrium.reporting.translating.Translatable

/**
 * Defines the contract for sophisticated `contains` [Assertion] builders for [Iterable] like types.
 *
 * The building process is typically started by the creation of a [Builder],
 * goes on by specifying a desired [SearchBehaviour],
 * defines which [Checker]s should be applied and
 * is finalized by a final step using a [Creator].
 */
interface IterableLikeContains {

    /**
     * The entry point of the contract, containing the [container] -- i.e. the subject of the assertion
     * for which the sophisticated `contains` assertion should be created -- as well as the chosen [searchBehaviour].
     *
     * The [searchBehaviour] might me modified in which case it is recommended that a new [Builder] is created (retain
     * immutability).
     *
     * @param Subject the type of the subject of the assertion
     */
    interface Builder<Subject : Any, E, out S : SearchBehaviour> : Contains.Builder<Subject, S> {
        /**
         * Converts the subject of the assertion into an [Iterable]`<E>` on which the search will be carried out.
         */
        val converter: (Subject) ->  Iterable<E>
    }

    /**
     * The step of choosing/defining [Checker]s.
     */
    interface CheckerStep<Subject : Any, E, out S : SearchBehaviour>
        : Contains.CheckerStep<Subject, S, Checker, Builder<Subject, E, S>>

    /**
     * Represents a search behaviour but leaves it up to the [Creator] how this behaviour is implemented -- yet, it
     * provides a method to decorate a description (a [Translatable]) in order that it reflects the search behaviour.
     */
    interface SearchBehaviour : Contains.SearchBehaviour

    /**
     * Represents the final step of a sophisticated `contains` assertion builder which creates the [AssertionGroup]
     * as such.
     *
     * @param Subject The type of the subject of the assertion.
     * @param SC The type of the search criteria.
     */
    interface Creator<Subject : Any, E, in SC> : Contains.Creator<Subject, SC> {
        /**
         * Converts the subject of the assertion into an [Iterable]`<E>`on which the search will be carried out.
         */
        val converter: (Subject) ->  Iterable<E>
    }

    /**
     * Represents a check for the search result such as:
     * the object is contained exactly once in the input of the search.
     *
     * It provides the method [createAssertion] which creates an [Assertion] representing this check.
     */
    interface Checker : Contains.Checker
}
