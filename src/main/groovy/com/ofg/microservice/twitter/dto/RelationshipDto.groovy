package com.ofg.microservice.twitter.dto

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@CompileStatic
@Canonical
class RelationshipDto {

    int score
    String description
}
