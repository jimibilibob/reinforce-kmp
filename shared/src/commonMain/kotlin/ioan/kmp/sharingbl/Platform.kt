package ioan.kmp.sharingbl

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform