import io.pdf4k.dsl.PdfBuilder.Companion.pdf

fun hello() = pdf {
    section {
        content {
            +"Hello, world!"
        }
    }
}