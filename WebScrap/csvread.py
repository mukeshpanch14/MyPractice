import pandas as pd

df=pd.read_csv('test.csv')
amount_df=df.loc[df['Credit/Debit']=='Debit']
print(sum(amount_df['Amount']))

def totalDebit():
    