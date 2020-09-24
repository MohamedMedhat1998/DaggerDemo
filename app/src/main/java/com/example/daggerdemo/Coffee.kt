package com.example.daggerdemo

import javax.inject.Inject

class Coffee @Inject constructor(val farm: Farm, val river: River)