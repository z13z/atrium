package ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.builders

import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.logic.creating.iterablelike.contains.IterableLikeContains

class IterableLikeContainsBuilder<T : Any, E, out S : IterableLikeContains.SearchBehaviour>(
    override val container: AssertionContainer<T>,
    override val converter: (T) -> Iterable<E>,
    override val searchBehaviour: S
) : IterableLikeContains.Builder<T, E, S>
