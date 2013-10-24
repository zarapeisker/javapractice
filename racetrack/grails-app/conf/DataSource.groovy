dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "grails"
    password = "server"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost:3306/racetrack_dev?autoreconnect=true"
        }
        //update saved the data, create-drop drops the data each time you restart, create leaves the tables in place but deletes data on shutdown
    }// end development
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/racetrack_dev?autoreconnect=true"
        }
    }//end test
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/racetrack_dev?autoreconnect=true"
            //pooled = true
            //properties {
              // maxActive = -1
               //minEvictableIdleTimeMillis=1800000
               //timeBetweenEvictionRunsMillis=1800000
               //numTestsPerEvictionRun=3
               //testOnBorrow=true
               //testWhileIdle=true
               //testOnReturn=true
               //validationQuery="SELECT 1"
            //}
        }//end dataSource
    }//end production
}// end environ
