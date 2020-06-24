package ch.tutteli.atrium.logic.creating.iterablelike.contains.searchbehaviours

import ch.tutteli.atrium.logic.creating.iterablelike.contains.IterableLikeContains
import ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.searchbehaviours.InAnyOrderSearchBehaviourImpl

/**
 * Represents the search behaviour that expected entries might appear in any order within the [Iterable].
 */
interface InAnyOrderSearchBehaviour : IterableLikeContains.SearchBehaviour{
    companion object {
        operator fun invoke(): InAnyOrderSearchBehaviour =
            InAnyOrderSearchBehaviourImpl()
    }
}
