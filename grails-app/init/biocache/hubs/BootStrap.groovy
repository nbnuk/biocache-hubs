package biocache.hubs

import au.org.ala.biocache.hubs.SearchRequestParams

class BootStrap {

    def init = { servletContext ->
        initSearchRequestParams();
    }
    def destroy = {
    }

    static def initSearchRequestParams = {
        SearchRequestParams.metaClass.nbnRequiredFacets = [] as String[]
    }
}
