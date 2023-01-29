package org.projectvoyage.voyage.app.model.search.criteria.range;

import org.projectvoyage.voyage.app.infra.exception.flow.InvalidParameterException;
import org.projectvoyage.voyage.app.infra.util.Checks;

/**
 * Pagination parameters for data retrieval operations
 */
public class RangeCriteria {
    /**
     * Page index(0-based)
     */
    private final int page;

    /**
     * Number of element per page
     */
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {

        //          1 вариант
//        if (page < 0) {
//            throw new InvalidParameterException("Incorrect page index:" + page);
//        }
//
//        if (rowCount < 0){
//            throw new java.security.InvalidParameterException("Incorrect row count:" + rowCount);
//            }

        //          2 вариант
        Checks.checkParameter(page>=0, "Incorrect page index: " + page);
        Checks.checkParameter(rowCount >= 0, "Incorrect row count: " + rowCount);

//        3 вариант
//        Preconditions.checkArgument(page>=0, "Incorrect page index:%s", page);
//        Preconditions.checkArgument(page >=0, "Incorrect row count:%s", rowCount);

        this.page = page;
        this.rowCount = rowCount;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
