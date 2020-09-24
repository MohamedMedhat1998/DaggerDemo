package com.example.daggerdemo

import javax.inject.Inject

/* Injected the constructor here because [Coffee] depends on [Farm].
Doing this, the [CoffeeComponent] -Which is responsible for providing a [Coffee]- will be able to use a [Farm] instance.
*/
class Farm @Inject constructor()