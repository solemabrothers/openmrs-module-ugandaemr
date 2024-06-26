<style type="text/css">
img {
    width: 100px;
    height: auto;
}
</style>
<% if (enableCliniciansMakeStabilityDecisions == "false") { %>
<div>
    <div class="stability">
        <div id="vl">${vlObs?.valueNumeric ?: ""}</div>

        <div id="vlDate">${vlDateObs?.valueDatetime ?: ""}</div>

        <div id="art_start_date">${artStartDate ?: ""}</div>

        <div id="regimen">${regimenObs?.valueCoded?.conceptId ?: ""}</div>

        <div id="regimen_started_date">${regimenObs?.encounter?.encounterDatetime ?: ""}</div>


        <div id="current_regimen_start_date">
            <% if (currentRegimenObs?.concept?.conceptId == baselineRegimenConceptId) { %>
            ${artStartDate ?: ""}
            <% } else { %>
            ${currentRegimenObs?.encounter?.encounterDatetime ?: ""}
            <% } %>
        </div>

        <% if (regimenBeforeDTGObs != "") { %>
        <div id="regimen_before_dtg">${regimenBeforeDTGObs?.valueCoded?.conceptId ?: ""}</div>

        <div id="regimen_started_date_before_dtg">${regimenBeforeDTGObs?.encounter?.encounterDatetime ?: ""}</div>
        <% } %>

        <div id="on_third_line">${onThirdRegimen}</div>

        <div id="adherence"><% adherenceObs?.each { %>
            ${it?.valueCoded?.name}<% } %></div>

        <div id="clinic_staging">${conceptForClinicStage}</div>

        <div id="sputum_date">${sputumResultDateObs?.valueDate ?: ""}</div>

        <div id="teatment_start_date">${sputumResultDateObs?.encounter?.encounterDatetime ?: ""}</div>

        <div id="sputum_value">${sputumResultObs?.valueCoded?.conceptId ?: ""}</div>

    </div>
    <obs class="horizontal" conceptId="5090" labelText="Height"
         showUnits="uicommons.units.centimeters" unitsCssClass="append-to-value"/>
    <% } %>
</div>