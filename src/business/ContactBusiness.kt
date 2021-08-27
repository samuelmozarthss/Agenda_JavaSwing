package business

import entity.ContactEntity
import repository.ContactRepository

class ContactBusiness() {

    private fun validate(name: String, phone: String) {

        if (name == "") {
            throw Exception("Preenchimento do campo 'Nome' é obrigatório")
        }

        if (phone == "") {
            throw Exception("Preenchimento do campo 'Telefone' é obrigatório")
        }
    }

    fun getContactCountDescription(): String {

        val list = getList()
//        if(list.isEmpty())
        return when {
            list.isEmpty() -> "0 contatos"
            list.size == 1 -> "1 contato"
            else -> "${list.size} contatos"
        }
    }

    private fun validateDelete(name: String, phone: String) {

        if (name == "" || phone == "") {

            throw Exception("É necessario selecionar um contato antes de remover")

        }
    }

    fun save(name: String, phone: String) {

        validate(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }


    fun delete(name: String, phone: String) {

        validateDelete(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }

    fun getList(): List<ContactEntity> {

        return ContactRepository.getList()

    }
}