import de.hybris.platform.core.model.order.CartModel
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService

FlexibleSearchService flexibleSearch = spring.getBean("flexibleSearchService")
ModelService modelService = spring.getBean("modelService")


final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery("select {pk} from {Cart}");
List<CartModel> carts = flexibleSearch.search(flexibleSearchQuery).getResult()

println(carts.size() + " carts will be removed")

modelService.removeAll(carts);

