package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.AppointmentResponseEnum.ParticipantStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.AppointmentResponseEnum.ParticipantStatus;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 */
public class AppointmentResponse extends DomainResource {

    /**
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
     */
    protected List<Identifier> identifier;

    /**
     * Appointment that this response is replying to.
     */
    protected Reference appointment;

    /**
     * The actual object that is the target of the reference (Appointment that this response is replying to.)
     */
    protected Appointment appointmentTarget;

    /**
     * Date/Time that the appointment is to take place, or requested new start time.
     */
    protected InstantType start;

    /**
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     */
    protected InstantType end;

    /**
     * Role of participant in the appointment.
     */
    protected List<CodeableConcept> participantType;

    /**
     * A Person, Location/HealthcareService or Device that is participating in the appointment.
     */
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    protected Resource actorTarget;

    /**
     * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     */
    protected Enumeration<ParticipantStatus> participantStatus;

    /**
     * Additional comments about the appointment.
     */
    protected StringType comment;

    private static final long serialVersionUID = 248548635L;

    /*
   * Constructor
   */
    public AppointmentResponse() {
        super();
    }

    /*
   * Constructor
   */
    public AppointmentResponse(Reference appointment, Enumeration<ParticipantStatus> participantStatus) {
        super();
        this.appointment = appointment;
        this.participantStatus = participantStatus;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public AppointmentResponse addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #appointment} (Appointment that this response is replying to.)
     */
    public Reference getAppointment() {
        if (this.appointment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.appointment");
            else if (Configuration.doAutoCreate())
                // cc
                this.appointment = new Reference();
        return this.appointment;
    }

    public boolean hasAppointment() {
        return this.appointment != null && !this.appointment.isEmpty();
    }

    /**
     * @param value {@link #appointment} (Appointment that this response is replying to.)
     */
    public AppointmentResponse setAppointment(Reference value) {
        this.appointment = value;
        return this;
    }

    /**
     * @return {@link #appointment} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Appointment that this response is replying to.)
     */
    public Appointment getAppointmentTarget() {
        if (this.appointmentTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.appointment");
            else if (Configuration.doAutoCreate())
                // aa
                this.appointmentTarget = new Appointment();
        return this.appointmentTarget;
    }

    /**
     * @param value {@link #appointment} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Appointment that this response is replying to.)
     */
    public AppointmentResponse setAppointmentTarget(Appointment value) {
        this.appointmentTarget = value;
        return this;
    }

    /**
     * @return {@link #start} (Date/Time that the appointment is to take place, or requested new start time.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public InstantType getStartElement() {
        if (this.start == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.start");
            else if (Configuration.doAutoCreate())
                // bb
                this.start = new InstantType();
        return this.start;
    }

    public boolean hasStartElement() {
        return this.start != null && !this.start.isEmpty();
    }

    public boolean hasStart() {
        return this.start != null && !this.start.isEmpty();
    }

    /**
     * @param value {@link #start} (Date/Time that the appointment is to take place, or requested new start time.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
     */
    public AppointmentResponse setStartElement(InstantType value) {
        this.start = value;
        return this;
    }

    /**
     * @return Date/Time that the appointment is to take place, or requested new start time.
     */
    public Date getStart() {
        return this.start == null ? null : this.start.getValue();
    }

    /**
     * @param value Date/Time that the appointment is to take place, or requested new start time.
     */
    public AppointmentResponse setStart(Date value) {
        if (value == null)
            this.start = null;
        else {
            if (this.start == null)
                this.start = new InstantType();
            this.start.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #end} (This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public InstantType getEndElement() {
        if (this.end == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.end");
            else if (Configuration.doAutoCreate())
                // bb
                this.end = new InstantType();
        return this.end;
    }

    public boolean hasEndElement() {
        return this.end != null && !this.end.isEmpty();
    }

    public boolean hasEnd() {
        return this.end != null && !this.end.isEmpty();
    }

    /**
     * @param value {@link #end} (This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
     */
    public AppointmentResponse setEndElement(InstantType value) {
        this.end = value;
        return this;
    }

    /**
     * @return This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     */
    public Date getEnd() {
        return this.end == null ? null : this.end.getValue();
    }

    /**
     * @param value This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     */
    public AppointmentResponse setEnd(Date value) {
        if (value == null)
            this.end = null;
        else {
            if (this.end == null)
                this.end = new InstantType();
            this.end.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #participantType} (Role of participant in the appointment.)
     */
    public List<CodeableConcept> getParticipantType() {
        if (this.participantType == null)
            this.participantType = new ArrayList<CodeableConcept>();
        return this.participantType;
    }

    public boolean hasParticipantType() {
        if (this.participantType == null)
            return false;
        for (CodeableConcept item : this.participantType) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #participantType} (Role of participant in the appointment.)
     */
    // syntactic sugar
    public CodeableConcept addParticipantType() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.participantType == null)
            this.participantType = new ArrayList<CodeableConcept>();
        this.participantType.add(t);
        return t;
    }

    // syntactic sugar
    public AppointmentResponse addParticipantType(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.participantType == null)
            this.participantType = new ArrayList<CodeableConcept>();
        this.participantType.add(t);
        return this;
    }

    /**
     * @return {@link #actor} (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public Reference getActor() {
        if (this.actor == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.actor");
            else if (Configuration.doAutoCreate())
                // cc
                this.actor = new Reference();
        return this.actor;
    }

    public boolean hasActor() {
        return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public AppointmentResponse setActor(Reference value) {
        this.actor = value;
        return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public Resource getActorTarget() {
        return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A Person, Location/HealthcareService or Device that is participating in the appointment.)
     */
    public AppointmentResponse setActorTarget(Resource value) {
        this.actorTarget = value;
        return this;
    }

    /**
     * @return {@link #participantStatus} (Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.). This is the underlying object with id, value and extensions. The accessor "getParticipantStatus" gives direct access to the value
     */
    public Enumeration<ParticipantStatus> getParticipantStatusElement() {
        if (this.participantStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.participantStatus");
            else if (Configuration.doAutoCreate())
                // bb
                this.participantStatus = new Enumeration<ParticipantStatus>(new ParticipantStatusEnumFactory());
        return this.participantStatus;
    }

    public boolean hasParticipantStatusElement() {
        return this.participantStatus != null && !this.participantStatus.isEmpty();
    }

    public boolean hasParticipantStatus() {
        return this.participantStatus != null && !this.participantStatus.isEmpty();
    }

    /**
     * @param value {@link #participantStatus} (Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.). This is the underlying object with id, value and extensions. The accessor "getParticipantStatus" gives direct access to the value
     */
    public AppointmentResponse setParticipantStatusElement(Enumeration<ParticipantStatus> value) {
        this.participantStatus = value;
        return this;
    }

    /**
     * @return Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     */
    public ParticipantStatus getParticipantStatus() {
        return this.participantStatus == null ? null : this.participantStatus.getValue();
    }

    /**
     * @param value Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     */
    public AppointmentResponse setParticipantStatus(ParticipantStatus value) {
        if (this.participantStatus == null)
            this.participantStatus = new Enumeration<ParticipantStatus>(new ParticipantStatusEnumFactory());
        this.participantStatus.setValue(value);
        return this;
    }

    /**
     * @return {@link #comment} (Additional comments about the appointment.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public StringType getCommentElement() {
        if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create AppointmentResponse.comment");
            else if (Configuration.doAutoCreate())
                // bb
                this.comment = new StringType();
        return this.comment;
    }

    public boolean hasCommentElement() {
        return this.comment != null && !this.comment.isEmpty();
    }

    public boolean hasComment() {
        return this.comment != null && !this.comment.isEmpty();
    }

    /**
     * @param value {@link #comment} (Additional comments about the appointment.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
     */
    public AppointmentResponse setCommentElement(StringType value) {
        this.comment = value;
        return this;
    }

    /**
     * @return Additional comments about the appointment.
     */
    public String getComment() {
        return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Additional comments about the appointment.
     */
    public AppointmentResponse setComment(String value) {
        if (Utilities.noString(value))
            this.comment = null;
        else {
            if (this.comment == null)
                this.comment = new StringType();
            this.comment.setValue(value);
        }
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("appointment", "Reference(Appointment)", "Appointment that this response is replying to.", 0, java.lang.Integer.MAX_VALUE, appointment));
        childrenList.add(new Property("start", "instant", "Date/Time that the appointment is to take place, or requested new start time.", 0, java.lang.Integer.MAX_VALUE, start));
        childrenList.add(new Property("end", "instant", "This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.", 0, java.lang.Integer.MAX_VALUE, end));
        childrenList.add(new Property("participantType", "CodeableConcept", "Role of participant in the appointment.", 0, java.lang.Integer.MAX_VALUE, participantType));
        childrenList.add(new Property("actor", "Reference(Patient|Practitioner|RelatedPerson|Device|HealthcareService|Location)", "A Person, Location/HealthcareService or Device that is participating in the appointment.", 0, java.lang.Integer.MAX_VALUE, actor));
        childrenList.add(new Property("participantStatus", "code", "Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.", 0, java.lang.Integer.MAX_VALUE, participantStatus));
        childrenList.add(new Property("comment", "string", "Additional comments about the appointment.", 0, java.lang.Integer.MAX_VALUE, comment));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("appointment"))
            // Reference
            this.appointment = castToReference(value);
        else if (name.equals("start"))
            // InstantType
            this.start = castToInstant(value);
        else if (name.equals("end"))
            // InstantType
            this.end = castToInstant(value);
        else if (name.equals("participantType"))
            this.getParticipantType().add(castToCodeableConcept(value));
        else if (name.equals("actor"))
            // Reference
            this.actor = castToReference(value);
        else if (name.equals("participantStatus"))
            // Enumeration<ParticipantStatus>
            this.participantStatus = new ParticipantStatusEnumFactory().fromType(value);
        else if (name.equals("comment"))
            // StringType
            this.comment = castToString(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("appointment")) {
            this.appointment = new Reference();
            return this.appointment;
        } else if (name.equals("start")) {
            throw new FHIRException("Cannot call addChild on a primitive type AppointmentResponse.start");
        } else if (name.equals("end")) {
            throw new FHIRException("Cannot call addChild on a primitive type AppointmentResponse.end");
        } else if (name.equals("participantType")) {
            return addParticipantType();
        } else if (name.equals("actor")) {
            this.actor = new Reference();
            return this.actor;
        } else if (name.equals("participantStatus")) {
            throw new FHIRException("Cannot call addChild on a primitive type AppointmentResponse.participantStatus");
        } else if (name.equals("comment")) {
            throw new FHIRException("Cannot call addChild on a primitive type AppointmentResponse.comment");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "AppointmentResponse";
    }

    public AppointmentResponse copy() {
        AppointmentResponse dst = new AppointmentResponse();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.appointment = appointment == null ? null : appointment.copy();
        dst.start = start == null ? null : start.copy();
        dst.end = end == null ? null : end.copy();
        if (participantType != null) {
            dst.participantType = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : participantType) dst.participantType.add(i.copy());
        }
        ;
        dst.actor = actor == null ? null : actor.copy();
        dst.participantStatus = participantStatus == null ? null : participantStatus.copy();
        dst.comment = comment == null ? null : comment.copy();
        return dst;
    }

    protected AppointmentResponse typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof AppointmentResponse))
            return false;
        AppointmentResponse o = (AppointmentResponse) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(appointment, o.appointment, true) && compareDeep(start, o.start, true) && compareDeep(end, o.end, true) && compareDeep(participantType, o.participantType, true) && compareDeep(actor, o.actor, true) && compareDeep(participantStatus, o.participantStatus, true) && compareDeep(comment, o.comment, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof AppointmentResponse))
            return false;
        AppointmentResponse o = (AppointmentResponse) other;
        return compareValues(start, o.start, true) && compareValues(end, o.end, true) && compareValues(participantStatus, o.participantStatus, true) && compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (appointment == null || appointment.isEmpty()) && (start == null || start.isEmpty()) && (end == null || end.isEmpty()) && (participantType == null || participantType.isEmpty()) && (actor == null || actor.isEmpty()) && (participantStatus == null || participantStatus.isEmpty()) && (comment == null || comment.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.AppointmentResponse;
    }

    public static final String SP_ACTOR = "actor";

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_PRACTITIONER = "practitioner";

    public static final String SP_PARTSTATUS = "part-status";

    public static final String SP_PATIENT = "patient";

    public static final String SP_APPOINTMENT = "appointment";

    public static final String SP_LOCATION = "location";
}
