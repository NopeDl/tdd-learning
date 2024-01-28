package main

import (
	"testing"
)

// 测试代码
func TestMultiplication(t *testing.T) {
	fiver := &Money{
		amount:  5,
		curreny: DOLLAR,
	}
	tenner := fiver.Times(2)

  fiver.amount = 10
  assertEqual(t, fiver, tenner)
}

func TestMultiplicationInEur(t *testing.T) {
	eurMoney := &Money{
		amount:  10,
		curreny: 1,
	}

	tenner := eurMoney.Times(2)
  eurMoney.amount = 20
  assertEqual(t, eurMoney, tenner)
}

func TestDivision(t *testing.T) {
	krw := &Money{
		amount:  4002,
		curreny: 2,
	}

	tenner := krw.Division(4)
  krw.amount = 1000.5
  assertEqual(t, krw, tenner)
}

func assertEqual(t *testing.T, expected *Money, actual *Money) {
  if *expected != *actual {
    t.Errorf("expected %+v Got %+v", expected, actual)
  }
}

// 业务代码
type MoneyType int

const (
	DOLLAR MoneyType = 0
	EUR    MoneyType = 1
	KRW    MoneyType = 2
)

type Money struct {
	amount  float64
	curreny MoneyType
}

func (self *Money) Times(time float64) *Money {
	return &Money{self.amount * time, self.curreny}
}

func (self *Money) Division(divisor float64) *Money {
	return &Money{self.amount / divisor, self.curreny}
}
