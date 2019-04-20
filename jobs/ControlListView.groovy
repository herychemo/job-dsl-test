
listView('Control') {
    description('All jobs with control actions.')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/(Start.*|Stop.*).*/)
    }
    jobFilters {
        status {
            status(Status.STABLE)
        }
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
