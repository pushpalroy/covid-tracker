package com.pushpal.covidtracker.utils.exceptions

class LoggedOutException(val isUserAction: Boolean = false) : Exception("User logged out!")