package nullability.kotlin

fun main(args: Array<String>) {
    var m: Meeting? = null
    var newMeeting = Meeting()

    //Elvis(?:) -> if m is null then new Meeting(), else assign m to newMeeting
    newMeeting = m ?: Meeting()

    closeMeeting(m)
    closeMeeting(newMeeting)

    // let is called if m is non-null
    m?.let {
        closeMeetingNonNull(m)
    }
}

fun closeMeetingNonNull(m: Meeting): Boolean? {
    return if (m.canClose == true) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean? {
    // Safe Call(?.) -> if m is not null, then call canClose
    return if (m?.canClose == true) m?.close()
    else false
}

class Meeting {
    val canClose: Boolean = false
    // later init
    lateinit var address: Address

    fun close(): Boolean {
        return true
    }

    fun save(o: Any) {
        // Safe cast(as?) -> if o is type of ISaveable, set o to saveable, otherwise set o to null
        val saveable = o as? ISaveable
        saveable?.save()
    }

    fun init(addr: Address) {
        address = addr
    }
}

interface ISaveable {
    fun save()
}

class Address {}