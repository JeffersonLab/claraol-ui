
#Clara Ontology Language Editor ~(claraol-ui)
####Graphical user interface for describing CLARA data processing application details.

Description
-----------
To describe data processing application Clara provides a simple modeling language. This is a textual representation of the data-flow diagram of a service based application. It simply describes data routing schema between services. Data routing information is stored within the transient metadata in the composition field. This simple modeling language can be visualized by means of a very general kind of directed graph, whose vertices are services and edges are data links.

Design
------
The simple Clara modeling language that is designed to describe the data routing obviously needs evolution to be able to describe service as well as orchestration details. The primary goal of this effort is to unify service, data flow (i.e. data processing algorithm) and application run-time orchestration descriptions. As a result generic orchestrator will be provided that works over the textual description of an application (no more orchestrator codding).
So we decided to represent Clara application models as ontologies to be able to benefit from their exclusive features. For example, reasoning services could be applied to detect whether an application dataflow constraints are contradicting, resulting in the application to be unsustainable. In general, ontologies are used to define sets of concepts that describe domain knowledge and allow for specifying classes by precise logical definitions.   Furthermore, ontology language inherits the modularization mechanism of XML, namely namespaces and imports (text inclusion).

Development
-----------
The ClarOL is developed using RDF (resource definition framework). The atomic structure for RDF specifications is the statement, which is a <subject predicate object>-triple. The information being described is a subject, which is one of the objects of the ClaraOL  RDF class (yellow rectangles in the graph). Examples of the ClaraOL subjects are: Service, DataSource, Identity, State, etc.
The predicate of a statement is the property of a described subject, value of which appears as the statement object. The property value can be a resource (such as another ClaraOL class object) as well as for example a literal value (a string, e.g. a name). Predicates are presented as blue or green rectangles on the ClaraOL node-arch diagram. Examples of ClaraOL predicates are: hasIdentity, needsConfiguration, hasEngine, hasState, etc.
RDF triples can be visualized as a directed labeled graph, in which subjects and objects are represented as nodes, and predicates as arcs.

We think that ClaraOL is complete enough to describe wide variety of data processing applications, including compile time description, such as service configuration, application algorithm (loops, conditional statements, etc.), as well as run-time description and control, such as workflow (orchestration), dataflow management. Yet, we realize that the language will evolve over time based on future application design requirements.
