import io.pdf4k.testing.AbstractPdfRendererTest
import io.pdf4k.testing.PdfApprover
import org.junit.jupiter.api.Test

class HelloTest : AbstractPdfRendererTest() {
    @Test
    fun `hello world`(approver: PdfApprover) {
        hello().approve(approver)
    }
}