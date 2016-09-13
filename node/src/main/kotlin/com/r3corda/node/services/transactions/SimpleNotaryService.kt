package com.r3corda.node.services.transactions

import com.r3corda.core.node.services.ServiceType
import com.r3corda.core.node.services.TimestampChecker
import com.r3corda.core.node.services.UniquenessProvider
import com.r3corda.core.utilities.loggerFor
import com.r3corda.node.services.api.ServiceHubInternal
import com.r3corda.protocols.NotaryProtocol

/** A simple Notary service that does not perform transaction validation */
class SimpleNotaryService(services: ServiceHubInternal,
                          timestampChecker: TimestampChecker,
                          uniquenessProvider: UniquenessProvider) : NotaryService(services, timestampChecker, uniquenessProvider) {
    object Type : ServiceType("corda.notary.simple")

    override val logger = loggerFor<SimpleNotaryService>()

    override val protocolFactory = NotaryProtocol.DefaultFactory
}
