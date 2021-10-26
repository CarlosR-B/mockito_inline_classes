import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

internal class ClassToBeMockedTest {

    private val classToBeMocked: ClassToBeMocked = mock()

    @Test
    fun methodToBeMocked() {
        doReturn("I am not you").whenever(classToBeMocked).methodToBeMocked(any())
    }
}