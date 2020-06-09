import ch.tutteli.atrium.api.fluent.en_GB.scala._
import ch.tutteli.atrium.api.verbs.internal.AtriumVerbsKt.expect

object Test {
    def main(args: Array[String]): Unit = {
        expect(1).toBe(2)
    }

}
