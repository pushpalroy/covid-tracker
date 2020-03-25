package com.pushpal.covidtracker.utils.exceptions

import com.pushpal.covidtracker.model.network.models.ResponseUnauthorized

class HttpNotSuccessException(val responseError: ResponseUnauthorized) :
    Exception(responseError.message)