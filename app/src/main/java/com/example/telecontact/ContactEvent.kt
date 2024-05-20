package com.example.telecontact

sealed interface ContactEvent {
    object saveContact: ContactEvent
    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent
    data class SortContacts(val sortType: SortType): ContactEvent
    data class DeleteContacts(val contact: Contact): ContactEvent
    object showDialog: ContactEvent
    object Hidedialog: ContactEvent
}