package it.moondroid.wearcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

import it.moondroid.common.logic.Calculator;

public class WearActivity extends Activity {

    /**
     * Internal state for calculator.
     */
    private Calculator calculator;

    /**
     * Output display for calculator.
     */
    private TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wear);

        /** Initialize variables. */
        calculator = new Calculator(this);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                outputView = (TextView) findViewById(R.id.outputView);
            }
        });
    }

    // @Override -- From XML layout
    public void onButtonClick(View v) {
        if (v != null) {
            final int id = v.getId();

            switch (id) {
                case R.id.second:
                    // TODO
                    break;
                case R.id.cpt:
                    // TODO
                    break;
                case R.id.enter:
                    calculator.selectEnter();
                    break;
                case R.id.up_arrow:
                    calculator.selectUpArrow();
                    break;
                case R.id.down_arrow:
                    calculator.selectDownArrow();
                    break;
                case R.id.cf:
                    // TODO
                    break;
                case R.id.n:
                    // TODO
                    break;
                case R.id.i_y:
                    // TODO
                    break;
                case R.id.pv:
                    // TODO
                    break;
                case R.id.pmt:
                    // TODO
                    break;
                case R.id.fv:
                    // TODO
                    break;
                case R.id.npv:
                    // TODO
                    break;
                case R.id.percent:
                    // TODO
                    break;
                case R.id.sqrt_x:
                    calculator.selectSqrtX();
                    break;
                case R.id.x_squared:
                    calculator.selectXSquared();
                    break;
                case R.id.right_arrow:
                    calculator.selectRightArrow();
                    break;
                case R.id.ac:
                    calculator.selectAc();
                    break;
                case R.id.inv:
                    // TODO
                    break;
                case R.id.left_parenthesis:
                    calculator.selectLeftParenthesis();
                    break;
                case R.id.right_parenthesis:
                    calculator.selectRightParenthesis();
                    break;
                case R.id.y_to_power_of_x:
                    calculator.selectYPowX();
                    break;
                case R.id.divide:
                    calculator.selectDivide();
                    break;
                case R.id.ln:
                    calculator.selectLn();
                    break;
                case R.id.seven:
                    calculator.selectDigit(7);
                    break;
                case R.id.eight:
                    calculator.selectDigit(8);
                    break;
                case R.id.nine:
                    calculator.selectDigit(9);
                    break;
                case R.id.multiply:
                    calculator.selectMultiply();
                    break;
                case R.id.sto:
                    calculator.selectSto();
                    break;
                case R.id.four:
                    calculator.selectDigit(4);
                    break;
                case R.id.five:
                    calculator.selectDigit(5);
                    break;
                case R.id.six:
                    calculator.selectDigit(6);
                    break;
                case R.id.minus:
                    calculator.selectSubtract();
                    break;
                case R.id.rcl:
                    calculator.selectRcl();
                    break;
                case R.id.one:
                    calculator.selectDigit(1);
                    break;
                case R.id.two:
                    calculator.selectDigit(2);
                    break;
                case R.id.three:
                    calculator.selectDigit(3);
                    break;
                case R.id.plus:
                    calculator.selectAdd();
                    break;
                case R.id.ce_c:
                    calculator.selectCe();
                    break;
                case R.id.zero:
                    calculator.selectDigit(0);
                    break;
                case R.id.dot:
                    calculator.selectDecimal();
                    break;
                case R.id.plusMinus:
                    calculator.selectPlusMinus();
                    break;
                case R.id.equals:
                    calculator.selectEquals();
                    break;
            }

        }


        updateOutput();
    }

    private void updateOutput() {
        outputView.setText(calculator.getExpression());
    }
}
