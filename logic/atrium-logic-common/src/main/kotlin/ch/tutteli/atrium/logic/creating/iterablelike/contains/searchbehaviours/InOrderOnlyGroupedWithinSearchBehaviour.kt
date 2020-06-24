package ch.tutteli.atrium.logic.creating.iterablelike.contains.searchbehaviours

import ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.searchbehaviours.InOrderOnlyGroupedWithinSearchBehaviourImpl

/**
 * Represents a filler step to emphasise that the next step defines the order within a group of a
 * [InOrderOnlyGroupedSearchBehaviour].
 */
interface InOrderOnlyGroupedWithinSearchBehaviour :
    InOrderOnlyGroupedSearchBehaviour {
    companion object {
        operator fun invoke(): InOrderOnlyGroupedWithinSearchBehaviour =
            InOrderOnlyGroupedWithinSearchBehaviourImpl()
    }
}
