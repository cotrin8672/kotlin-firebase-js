@file:JsModule("firebase/auth")
@file:JsNonModule
@file:Suppress("unused")

@Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "ENUM_CLASS_IN_EXTERNAL_DECLARATION_WARNING")
// language=JavaScript
@JsName("""({SESSION: 'SESSION', LOCAL: 'LOCAL', NONE: 'NONE'})""")
external enum class PersistenceType {
    SESSION,
    LOCAL,
    NONE
}
