package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {
    override fun newAbility(): Ability {
        return Ability("fallback")
    }
}


