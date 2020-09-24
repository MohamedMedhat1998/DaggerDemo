package com.example.daggerdemo

import javax.inject.Inject

/* Injected the constructor here because [Coffee] depends on [River].
Doing this, the [CoffeeComponent] -Which is responsible for providing a [Coffee]- will be able to use a [River] instance.
*/
class River @Inject constructor()