<?xml version="1.0" encoding="UTF-8"?>
<b:beans 
	xmlns="urn:schemas:morphis:foundations:formmodel"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:b="http://www.springframework.org/schema/beans"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd urn:schemas:morphis:foundations:formmodel http://www.morphis-tech.com/schema/foundations/formmodel.xsd">
	
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/CG__CTRL.Manager.Config.xml"/>
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/BLOQUE_IMPRESION.Manager.Config.xml"/>
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/BLOQUE_ACCIONES.Manager.Config.xml"/>
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/EXPEDI.Manager.Config.xml"/>
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/AUX.Manager.Config.xml"/>
		<b:import resource="classpath:/es/juntadeandalucia/ingresos/sur/forms/J030303/model/J030303.ValueSet.Config.xml"/>

	
	<formModel id="J030303.Model.Config" name="J030303" concurrencyCheckConstraints="KeyBased" rowConcurrencyCheckMode="Bulk" saveProcessingMode="Single">
		<modelClass>es.juntadeandalucia.ingresos.sur.forms.J030303.model.J030303Model</modelClass>
		
		<businessObjects>
			<businessObject name="CG$CTRL" manager="CG__CTRL.Manager.Config">
		
		
			</businessObject>
			<businessObject name="BLOQUE_IMPRESION" manager="BLOQUE_IMPRESION.Manager.Config">
		
		
			</businessObject>
			<businessObject name="BLOQUE_ACCIONES" manager="BLOQUE_ACCIONES.Manager.Config">
		
		
			</businessObject>
			<businessObject name="EXPEDI" manager="EXPEDI.Manager.Config">
			<summaries>
				<item name="TOTALREG" summarizedBusinessObject="EXPEDI" summarizedItem="NUMEXPED"/>

			</summaries>
		
		
			</businessObject>
			<businessObject name="AUX" manager="AUX.Manager.Config"> 
		
		
			</businessObject> 
		</businessObjects>
		<valueSets>
				<valueSet config="RG_CODTER.ValueSet.Config"/>
				<valueSet config="RG_CIRCUITOS.ValueSet.Config"/>
				<valueSet config="RG_TRAMITE.ValueSet.Config"/>
				<valueSet config="RG_CODMODEL.ValueSet.Config"/>
				<valueSet config="RG_CONCEPTO.ValueSet.Config"/>
				<valueSet config="RG_NOTARIO.ValueSet.Config"/>
				<valueSet config="RG_NOTARIA.ValueSet.Config"/>
		</valueSets>

	</formModel>
</b:beans>
