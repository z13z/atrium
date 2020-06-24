package ch.tutteli.atrium.logic.creating.iterablelike.contains.searchbehaviours

import ch.tutteli.atrium.logic.creating.iterablelike.contains.IterableLikeContains
import ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.searchbehaviours.InOrderSearchBehaviourImpl

/**
 * Represents the search behaviour that expected entries have to appear in the given order within the [Iterable].
 */
interface InOrderSearchBehaviour : IterableLikeContains.SearchBehaviour{
    companion object {
        operator fun invoke(): InOrderSearchBehaviour =
            InOrderSearchBehaviourImpl()
    }
}
