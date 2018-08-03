import PyPDF2 as PDF
import os

merger=PDF.PdfFileMerger()
source='./Nuthan/'
for file in os.listdir('./Nuthan/'):
    print(file)
    file_path=os.path.join(source,file)
    path=open(file_path,'rb')
    merger.append(fileobj=path)
    
merger.write(open("test_out.pdf", 'wb'))