package cavendish.blazegraph.ldp;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

public interface Vocabulary {
  URI BASIC_CONTAINER = new URIImpl(cavendish.ldp.api.Vocabulary.BASIC_CONTAINER.toString());
  String CONSTRAINED_BY = cavendish.ldp.api.Vocabulary.CONSTRAINED_BY.toString();
  URI CONTAINER = new URIImpl(cavendish.ldp.api.Vocabulary.CONTAINER.toString());
  URI CONTAINS = new URIImpl(cavendish.ldp.api.Vocabulary.CONTAINS.toString());
  URI DELETED = new URIImpl(cavendish.ldp.api.Vocabulary.DELETED.toString());
  URI DIRECT_CONTAINER = new URIImpl(cavendish.ldp.api.Vocabulary.DIRECT_CONTAINER.toString());
  URI IANA_TYPE = new URIImpl(cavendish.ldp.api.Vocabulary.IANA_TYPE.toString());
  URI INDIRECT_CONTAINER = new URIImpl(cavendish.ldp.api.Vocabulary.INDIRECT_CONTAINER.toString());
  URI INTERNAL_CONTEXT = new URIImpl(cavendish.ldp.api.Vocabulary.INTERNAL_CONTEXT.toString());
  URI RDF_SOURCE = new URIImpl(cavendish.ldp.api.Vocabulary.RDF_SOURCE.toString());
  URI RESOURCE = new URIImpl(cavendish.ldp.api.Vocabulary.RESOURCE.toString());
  String DEFAULT_NS = cavendish.ldp.api.Vocabulary.DEFAULT_NS;
  int SC_PRECONDITION_REQUIRED = 428;
}
