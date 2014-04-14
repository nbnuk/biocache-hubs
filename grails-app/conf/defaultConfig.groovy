//  Copyright (C) 2014 Atlas of Living Australia
//  All Rights Reserved.
//
//  The contents of this file are subject to the Mozilla Public
//  License Version 1.1 (the "License"); you may not use this file
//  except in compliance with the License. You may obtain a copy of
//  the License at http://www.mozilla.org/MPL/
//
//  Software distributed under the License is distributed on an "AS
//  IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
//  implied. See the License for the specific language governing
//  rights and limitations under the License.

//
// CAS properties - may be omitted for non-ALA deployments
//
//security.cas.appServerName = "http://dev.ala.org.au:8080"
//security.cas.casServerName = 'https://auth.ala.org.au'
//security.cas.uriFilterPattern = '/admin, /admin/.*'
//security.cas.authenticateOnlyIfLoggedInPattern = "/occurrences/(?!.+userAssertions|facet.+).+,/explore/your-area"
//ssecurity.cas.uriExclusionFilterPattern = '/images.*,/css.*,/js.*'
//security.cas.loginUrl = 'https://auth.ala.org.au/cas/login'
//security.cas.logoutUrl = 'https://auth.ala.org.au/cas/logout'
//security.cas.casServerUrlPrefix = 'https://auth.ala.org.au/cas'
//security.cas.bypass = false // set to true for non-ALA deployment
//security.cas.contextPath = "/generic-biocache-hub" //"/${appName}"
//security.cas.debugWebXml = true
auth.admin_role = "ROLE_ADMIN"


// skin settings
organisation.baseUrl = "http://www.ala.org.au"
skin.layout = "generic"
skin.fluidLayout = "true"
skin.orgNameLong = "Generic Portal"
skin.orgNameShort = "Generic"
skin.attribution = ""
skin.useAlaBie = true
skin.useAlaSpatialPortal = false

// web services
serverName = 'http://dev.ala.org.au:8080'
bie.baseUrl = "http://bie.ala.org.au"
biocache.apiKey = "api-key-to-use"
biocache.baseUrl = "http://biocache.ala.org.au/ws"
biocache.queryContext = "" // datahub uuid - e.g. ozcam  = " data_hub_uid:dh1 || avh = data_hub_uid:dh2"
biocache.downloads.extra = "dataResourceUid,dataResourceName.p"
collections.baseUrl = "http://collections.ala.org.au"
// For sandbox environment
//spatial.params = "&dynamic=true&ws=http%3A%2F%2Fsandbox.ala.org.au%2Fhubs-webapp&bs=http%3A%2F%2Fsandbox.ala.org.au%2Fbiocache-service"
spatial.baseUrl = "http://spatial.ala.org.au/"
spatial.params = ""
test.var="sugar"

//// AjaxProxy plugin settings - should be same as biocache.baseUrl
plugins {
    proxy {
        proxyScheme = 'http://'
        proxyHost = 'biocache.ala.org.au'
        proxyPort = '80'
        proxyPath = '/ws'
    }
}

chartsBgColour = "#fffef7"
clubRoleForHub = "ROLE_ADMIN"
dataQualityChecksUrl = "https://docs.google.com/spreadsheet/pub?key=0AjNtzhUIIHeNdHJOYk1SYWE4dU1BMWZmb2hiTjlYQlE&single=true&gid=0&output=csv"
// whether map or list is the default tab to show - empty for list and "mapView" for map
dwc.exclude = "dataHubUid,dataProviderUid,institutionUid,year,month,day,modified,left,right,provenance,taxonID,preferredFlag,outlierForLayers,speciesGroups,associatedMedia,images,userQualityAssertion,speciesHabitats,duplicationType,taxonomicIssues,subspeciesID,nameMatchMetric,sounds"

exploreYourArea.lat = "-35.0"
exploreYourArea.lng = "149.0"
exploreYourArea.location = "Canberra, ACT"

facets.limit = "100"
facets.customOrder = ""
facets.defaultColourBy = "basis_of_record"
facets.exclude = "dataHubUid,year,month,day,modified,left,right,provenance,taxonID,preferredFlag,outlierForLayers,speciesGroups,associatedMedia,images,userQualityAssertion,speciesHabitats,duplicationType,taxonomicIssues,subspeciesID,nameMatchMetric,sounds"
facets.hide = "genus,order,class,phylum,kingdom,raw_taxon_name,rank,interaction,raw_state_conservation,biogeographic_region,year,institution_uid,collection_uid"
facets.include = "establishment_means,user_assertions,assertion_user_id,name_match_metric,duplicate_type,alau_user_id,raw_datum,raw_sex,life_stage,elevation_d_rng,identified_by,species_subgroup"

map.cloudmade.key = "BC9A493B41014CAABB98F0471D759707"
map.defaultFacetMapColourBy = "basis_of_record"
map.pointColour = "df4a21"
map.zoomOutsideScopedRegion = true

sensitiveDataset.list = ""