import org.jetbrains.exposed.sql.Column
import java.util.Comparator

val kek: Column<*> get() = TODO()

private val comparator: Comparator<Column<*>> = compareBy({ it.table.tableName }, { it.name })