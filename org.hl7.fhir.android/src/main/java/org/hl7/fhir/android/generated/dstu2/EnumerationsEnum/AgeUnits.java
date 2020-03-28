package org.hl7.fhir.android.generated.dstu2.EnumerationsEnum;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.MessageEventEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.MessageEvent;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SearchParamType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGenderEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AdministrativeGender;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ResourceTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ResourceType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DocumentReferenceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SpecialValuesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.SpecialValues;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.FHIRDefinedTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.FHIRDefinedType;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataAbsentReasonEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.DataAbsentReason;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrengthEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.BindingStrength;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AgeUnitsEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.AgeUnits;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalenceEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConceptMapEquivalence;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcomeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.RemittanceOutcome;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.NoteTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.NoteType;

public enum AgeUnits {

    /**
     * null
     */
    MIN,
    /**
     * null
     */
    H,
    /**
     * null
     */
    D,
    /**
     * null
     */
    WK,
    /**
     * null
     */
    MO,
    /**
     * null
     */
    A,
    /**
     * added to help the parsers
     */
    NULL;

    public static AgeUnits fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("min".equals(codeString))
            return MIN;
        if ("h".equals(codeString))
            return H;
        if ("d".equals(codeString))
            return D;
        if ("wk".equals(codeString))
            return WK;
        if ("mo".equals(codeString))
            return MO;
        if ("a".equals(codeString))
            return A;
        throw new FHIRException("Unknown AgeUnits code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case MIN:
                return "min";
            case H:
                return "h";
            case D:
                return "d";
            case WK:
                return "wk";
            case MO:
                return "mo";
            case A:
                return "a";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case MIN:
                return "http://unitsofmeasure.org";
            case H:
                return "http://unitsofmeasure.org";
            case D:
                return "http://unitsofmeasure.org";
            case WK:
                return "http://unitsofmeasure.org";
            case MO:
                return "http://unitsofmeasure.org";
            case A:
                return "http://unitsofmeasure.org";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case MIN:
                return "";
            case H:
                return "";
            case D:
                return "";
            case WK:
                return "";
            case MO:
                return "";
            case A:
                return "";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case MIN:
                return "Minute";
            case H:
                return "Hour";
            case D:
                return "Day";
            case WK:
                return "Week";
            case MO:
                return "Month";
            case A:
                return "Year";
            default:
                return "?";
        }
    }
}
