/*
 * Copyright (c) 2019. Ivan Vakhrushev.
 * https://github.com/mfvanek
 *
 * This file is a part of "pg-index-health" - a Java library for analyzing and maintaining indexes health in Postgresql databases.
 */

package io.github.mfvanek.pg.index.maintenance;

import io.zonky.test.db.postgres.junit5.EmbeddedPostgresExtension;
import io.zonky.test.db.postgres.junit5.PreparedDbExtension;
import org.junit.jupiter.api.extension.RegisterExtension;

class StatisticsMaintenanceImplTestPg11 extends StatisticsMaintenanceImplTestBase {

    @RegisterExtension
    static final PreparedDbExtension embeddedPostgres =
            EmbeddedPostgresExtension.preparedDatabase(ds -> {});

    StatisticsMaintenanceImplTestPg11() {
        super(embeddedPostgres.getTestDatabase());
    }
}
