package com.awe.music.services

import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class EntryService @Autowired constructor() {
    private val _log = Logger.getLogger(EntryService::class.java)

    @KafkaListener
    fun sendRegistrationMail(email: String) {
        TODO("Write send email logic")
    }
}