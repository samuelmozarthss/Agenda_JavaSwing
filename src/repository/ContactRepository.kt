package repository

import entity.ContactEntity

class ContactRepository {

    companion object {

        private val contacList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {

            contacList.add(contact)

        }

        fun delete(contact: ContactEntity) {

            var index = 0
            for (item in contacList.withIndex()) {

                if (item.value.name == contact.name && item.value.phone == contact.phone) {
                    index = item.index
                    break
                }

            }

//          contacList.remove(contact)
            contacList.removeAt(index);
        }

        fun getList(): List<ContactEntity> {

            return contacList

        }
    }
}