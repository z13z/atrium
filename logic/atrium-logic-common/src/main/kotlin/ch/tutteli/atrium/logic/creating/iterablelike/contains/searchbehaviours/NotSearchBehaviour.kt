package ch.tutteli.atrium.logic.creating.iterablelike.contains.searchbehaviours

import ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.searchbehaviours.NotSearchBehaviourImpl

/**
 * Represents the search behaviour that expected entries might appear in any order within the [Iterable].
 */
interface NotSearchBehaviour :
    InAnyOrderSearchBehaviour {
    companion object {
        operator fun invoke(): NotSearchBehaviour =
            NotSearchBehaviourImpl()
    }
}
