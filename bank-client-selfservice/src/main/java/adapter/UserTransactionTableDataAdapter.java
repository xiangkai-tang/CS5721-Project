package adapter;

import Const.UserOperateType;
import model.UserTransactionModel;

import java.util.List;
import java.util.Vector;


/*
    Adapter: adapts the interface of Adaptee to the Target interface
 */
public class UserTransactionTableDataAdapter extends UserTransactionData implements TableData {   // adapter for UserTransactionModel

    public UserTransactionTableDataAdapter(List<UserTransactionModel> userTransactionModelList) {
        super(userTransactionModelList);
    }

    @Override
    public Vector getDataVector() {  // Request
        Vector dataVector = new Vector();

        for(UserTransactionModel userTransactionModel : this.getList()) {
            Vector rowVector = new Vector();
            rowVector.add(userTransactionModel.getDate().toString().substring(0, userTransactionModel.getDate().toString().indexOf(".")));
            rowVector.add(UserOperateType.getType(userTransactionModel.getOperation_type()));
            rowVector.add(userTransactionModel.getDetails());
            rowVector.add(userTransactionModel.getAmounts());
            rowVector.add(userTransactionModel.getBalance());

            dataVector.add(rowVector);

        }
        return dataVector;
    }

}
