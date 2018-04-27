package com.github.devnebulae.datascape.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration
import org.springframework.data.cassandra.config.SchemaAction
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification

@Configuration
class CassandraConfig : AbstractCassandraConfiguration() {
    @Autowired
    private lateinit var environment: Environment

    override fun getEntityBasePackages(): Array<String> {
        return arrayOf(
            "com.github.devnebulae.datascape.item"
        )
    }

    @Bean
    override fun getKeyspaceDrops(): MutableList<DropKeyspaceSpecification> {
        return mutableListOf(
            DropKeyspaceSpecification
                .dropKeyspace(keyspaceName)
                .ifExists()
        )
    }

    @Bean
    override fun getKeyspaceCreations(): MutableList<CreateKeyspaceSpecification> {
        return mutableListOf(
            CreateKeyspaceSpecification
                .createKeyspace(keyspaceName)
                .ifNotExists()
                .withSimpleReplication()
        )
    }

    override fun getKeyspaceName(): String {
        return environment.get("spring.data.cassandra.keyspace-name")
    }

    override fun getSchemaAction(): SchemaAction {
        return SchemaAction.CREATE_IF_NOT_EXISTS
    }
}
