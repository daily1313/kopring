package com.example.kopring.core.exception

import java.lang.RuntimeException

class InvalidInputException (
    message: String = "Invalid Input"
) : RuntimeException(message)
