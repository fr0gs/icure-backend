/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.taktik.icure.be.ehealth.logic.kmehr.smf

import org.taktik.icure.dto.mapping.ImportMapping
import org.taktik.icure.dto.result.CheckSMFPatientResult
import org.taktik.icure.dto.result.ImportResult
import org.taktik.icure.entities.HealthcareParty
import org.taktik.icure.entities.Patient
import org.taktik.icure.entities.User
import org.taktik.icure.services.external.api.AsyncDecrypt
import org.taktik.icure.services.external.http.websocket.AsyncProgress
import java.io.InputStream
import java.io.OutputStream

/**
 * @author Bernard Paulus on 24/05/17.
 */
interface SoftwareMedicalFileLogic {
	fun createSmfExport(os: OutputStream, patient: Patient, sfks: List<String>, sender: HealthcareParty, language: String, decryptor: AsyncDecrypt?, progressor: AsyncProgress?)
    fun importSmfFile(inputStream: InputStream,
                      author: User,
                      language: String,
                      dest: Patient? = null,
                      mappings: Map<String, List<ImportMapping>> = HashMap()): List<ImportResult>

    fun checkIfSMFPatientsExists(inputStream: InputStream,
                                          author: User,
                                          language: String,
                                          dest: Patient?,
                                          mappings: Map<String, List<ImportMapping>>
    ) : List<CheckSMFPatientResult>
}
